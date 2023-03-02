package Seminar12.Solid3.osp;

    public class Square  implements Shape {
        private int side;
        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        @Override
        public double getArea() {
            return Math.pow(getSide(), 2);
        }
    }