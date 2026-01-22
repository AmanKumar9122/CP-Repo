// // @PostMapping("/api/forecast")
// // public ResponseEntity<Void> saveForecast(@RequestBody ForecastDTO dto) {
// //     Forecast f = new Forecast();
// //     f.setProductId(dto.getProductId());
// //     f.setPeriod(dto.getPeriod());
// //     f.setPredictedQty(dto.getPredictedDemand());
// //     forecastRepo.save(f);

// //     ForecastMetric m = new ForecastMetric(dto.getProductId(),
// //             dto.getMae(), dto.getRmse());
// //     metricRepo.save(m);

// //     return ResponseEntity.ok().build();
// // }

// // payload = {
// //     "product_id": pid,
// //     "forecast_period": next_month,
// //     "predicted_demand": int(y_hat),
// //     "mae": float(mae),
// //     "rmse": float(rmse)
// // }
// // requests.post(POS_URL + "/api/forecast", json=payload)


// // static getters and setters Example

// // Can getters and setters be static in Java?
// // Yes, getters and setters can be static in Java. 
// // Static methods belong to the class rather than to any specific instance of the class. 
// // Therefore, static getters and setters can be used to access and modify static fields of the class.
// public class Q4A {
//     // static means - belongs to the class, not instances

//     private static String name;

//     public static String getName() {
//         return name;
//     }

//     public static void setName(String name) {
//         Q4A.name = name;
//     }
//     public static void main(String[] args) {
//         Q4A.setName("TestName");
//         System.out.println(Q4A.getName());
//     }
// }

// // What is Singleton Design Pattern?
// // The Singleton Design Pattern is a software design pattern that restricts the instantiation 
// // of a class to a single instance and provides a global point of access to that instance.

// // Singleton Example
// class Singleton {
//     private static Singleton instance;

//     private Singleton() {
//         // private constructor to prevent instantiation
//     }

//     public static Singleton getInstance() {
//         if (instance == null) {
//             instance = new Singleton();
//         }
//         return instance;
//     }
// }

// // What is Factory Method Design Pattern?
// // The Factory Method Design Pattern is a creational design pattern that provides an interface
// // Factory Method Example 
// abstract class Product {
//     public abstract void use();
// }
// class ConcreteProductA extends Product {
//     public void use() {
//         System.out.println("Using Product A");
//     }
// }

// // abstract class 
// // simple student example


// class Q4A {
//     public static int a;
//     public int b;

//     // Constructor with one parameter
//     public Q4A(int a) {
//         Q4A.a = a;   // assign to static variable
//     }

//     // Constructor with two parameters
//     public Q4A(int a, int b) {
//         Q4A.a = a;
//         this.b = b;
//     }
// }

// class Q4B extends Q4A {
//     public Q4B(int a, int b) {
//         super(a);     // calls Q4A(int a)
//         this.b = b;
//     }
//     public static void main(String[] args) {
//         Q4B obj = new Q4B(10, 20);

//         System.out.println("a = " + Q4A.a);
//         System.out.println("b = " + obj.b);
//     }
// }

// IS-A relationship example
class female{
    boolean beautiful;
    double salary;
    female(){
        this.beautiful = true;
        this.salary = 60000;
    }
    male m = new male(true, 50000);

}
class male{
    boolean handsome;
    double income;
    male(boolean handsome, double income){
        this.handsome = handsome;
        this.income = income;
    }
    female f = new female();
}


