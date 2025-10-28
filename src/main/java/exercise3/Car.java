package exercise3;

public class Car {
  public double fuelLevel;
  public double mileage;
  public String licensePlate;
  public double fuelConsumption;
  public int fuelCapacity;

  public Car(String licensePlate, int mileage, int fuelCapacity, double fuelConsumption, int fuelLevel) {
      this.licensePlate = licensePlate;
      this.mileage = mileage;
      this.fuelLevel = fuelLevel;
      this.fuelConsumption = fuelConsumption;
      this.fuelCapacity = fuelCapacity;

  }


  public double getFuelLevel(){
      return this.fuelLevel;
  }
  public double getMileage(){
      return this.mileage;
  }
  public String getLicensePlate(){
      return this.licensePlate;
  }
  public double getFuelConsumption(){
      return this.fuelConsumption;
  }
  public int  getFuelCapacity(){
      return this.fuelCapacity;
  }

  public void drive(int distance) {
      mileage += distance;
      fuelLevel -= fuelConsumption * distance;
      double reichweiteTank = distance * fuelConsumption;
      if (fuelLevel - reichweiteTank < 0) {
          double maxDistance = fuelLevel / fuelConsumption;
          mileage += (double) Math.round(maxDistance * 100) / 100;
          fuelLevel = 0.0;
      }




  }

  public void refuel(int amount) {
  fuelLevel = fuelCapacity;
      while (fuelLevel > 0 && fuelConsumption > fuelLevel) {
          fuelLevel = fuelCapacity;



      }
  }

  public String toString() {
      return "Car{licensePlate='" + licensePlate + "', mileage="+mileage+", fuelConsumption="+fuelConsumption+", fuelCapacity="+fuelCapacity+ ", fuelLevel="+fuelLevel+"}";
  }
}
