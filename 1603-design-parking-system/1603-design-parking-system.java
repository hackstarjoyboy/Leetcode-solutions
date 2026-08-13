class ParkingSystem {
    private int[] spots;
    public ParkingSystem(int big, int medium, int small) {
        this.spots=new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        int index=carType-1;
        if(this.spots[index]>0){
            this.spots[index]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */