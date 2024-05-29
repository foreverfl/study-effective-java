package chapter08;

import java.util.Date;

public class Item50_DefensiveCopiesForMutableFields {
    // 방어적 복사본을 사용하는 클래스
    static class DefensivePeriod {
        private final Date start;
        private final Date end;

        // 생성자에서 방어적 복사본을 만듦
        public DefensivePeriod(Date start, Date end) {
            // 유효성 검사
            if (start.after(end)) {
                throw new IllegalArgumentException("시작 날짜는 종료 날짜보다 앞서야 합니다.");
            }

            // 방어적 복사본 생성
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());
        }

        // 시작 날짜 반환 (방어적 복사본)
        public Date getStart() {
            return new Date(start.getTime());
        }

        // 종료 날짜 반환 (방어적 복사본)
        public Date getEnd() {
            return new Date(end.getTime());
        }
    }

    // 방어적 복사본을 사용하지 않는 클래스
    static class NonDefensivePeriod {
        private final Date start;
        private final Date end;

        // 생성자에서 방어적 복사본을 만들지 않음
        public NonDefensivePeriod(Date start, Date end) {
            // 유효성 검사
            if (start.after(end)) {
                throw new IllegalArgumentException("시작 날짜는 종료 날짜보다 앞서야 합니다.");
            }

            // 원본을 직접 저장
            this.start = start;
            this.end = end;
        }

        // 시작 날짜 반환 (원본)
        public Date getStart() {
            return start;
        }

        // 종료 날짜 반환 (원본)
        public Date getEnd() {
            return end;
        }
    }

    public static void main(String[] args) {
        // 정상적인 사용 예제
        Date start = new Date();
        Date end = new Date(start.getTime() + 1000000000L);

        // 방어적 복사본을 사용하는 클래스 테스트
        DefensivePeriod defensivePeriod = new DefensivePeriod(start, end);
        System.out.println("방어적 복사본 사용 - 시작 날짜: " + defensivePeriod.getStart());
        System.out.println("방어적 복사본 사용 - 종료 날짜: " + defensivePeriod.getEnd());

        // 방어적 복사본을 사용하지 않는 클래스 테스트
        NonDefensivePeriod nonDefensivePeriod = new NonDefensivePeriod(start, end);
        System.out.println("방어적 복사본 미사용 - 시작 날짜: " + nonDefensivePeriod.getStart());
        System.out.println("방어적 복사본 미사용 - 종료 날짜: " + nonDefensivePeriod.getEnd());

        // 원본 Date 객체 수정
        start.setTime(start.getTime() - 1000000000L);
        System.out.println("원본 수정 후 - 방어적 복사본 사용 - 시작 날짜: " + defensivePeriod.getStart());
        System.out.println("원본 수정 후 - 방어적 복사본 사용 - 종료 날짜: " + defensivePeriod.getEnd());
        System.out.println("원본 수정 후 - 방어적 복사본 미사용 - 시작 날짜: " + nonDefensivePeriod.getStart());
        System.out.println("원본 수정 후 - 방어적 복사본 미사용 - 종료 날짜: " + nonDefensivePeriod.getEnd());
    }
}
