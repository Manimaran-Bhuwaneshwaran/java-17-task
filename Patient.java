public record Patient(int id, String name, int age, String bloodGroup, String address) {
    public void printPatient() {
        System.out.println("Patient data");
        System.out.println("id          : " + id());
        System.out.println("name        : " + name());
        System.out.println("age         : " + age());
        System.out.println("blood group : " + bloodGroup());
        System.out.println("address     : " + address());
    }
}
