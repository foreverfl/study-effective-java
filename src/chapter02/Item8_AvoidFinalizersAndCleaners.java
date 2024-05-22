package chapter02;

import java.lang.ref.Cleaner;

public class Item8_AvoidFinalizersAndCleaners {
    public static class Room implements AutoCloseable {
        private static final Cleaner cleaner = Cleaner.create(); // 리소스를 청소하는데 사용됨.

        // Room의 상태를 나타냄. 정리작업을 수행함.
        private static class State implements Runnable {
            @SuppressWarnings("unused")
            int numJunkPiles; // 쓰레기 수

            State(int numJunkPiles) {
                this.numJunkPiles = numJunkPiles;
            }

            @Override
            public void run() {
                System.out.println("Cleaning room");
                numJunkPiles = 0;
            }
        }

        // 방의 상태
        private final State state;

        // 청소를 하는 cleanable
        private final Cleaner.Cleanable cleanable;

        public Room(int numJunkPiles) {
            state = new State(numJunkPiles);
            cleanable = cleaner.register(this, state);
        }

        @Override
        public void close() {
            cleanable.clean();
        }
    }

    public static void main(String[] args) {
        try (Room myRoom = new Room(5)) {
            System.out.println("Room created with 5 junk piles.");
        }
    }
}
