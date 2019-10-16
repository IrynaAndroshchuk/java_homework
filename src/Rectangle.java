class Rectangle {
    int length;
    int width;

    public Rectangle() {
        this.length = 16;
        this.width = 20;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int p() {
        return this.length * 2 + this.width * 2;
    }

    public int s() {
        return this.length * this.width;
    }
}