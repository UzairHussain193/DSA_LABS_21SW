public  class Task1_Rectangle{
        int length =1;
        int width=1;

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public void setLength(int length) {
            this.length = length;
            if (length > 0.0&& width<20.0) {
                this.length = length;
            }
            else {
                System.out.println("Enter the correct value" );
            }
        }

        public void setWidth(int width) {
            if (width > 0.0&& width<20.0) {
                this.width = width;
            }
            else {
                System.out.println("Enter the correct value" );
            }
        }

        public int perimeter(int  length, int width){
            return 2*length*width;
        }
        public int area(int  length, int width){
            return(length*width);
        }
        public static void main(String[] args) {
            Task1_Rectangle r = new Task1_Rectangle();
            System.out.println( "the area of rectangle is "+r.area(10,10));
            System.out.println("the perimeter of rectangle is "+r.perimeter(10,10));
        }
    }