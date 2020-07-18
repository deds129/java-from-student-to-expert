package OOP;

public class Cat extends Animal {
        private final Pet pet;

        public Cat(final Pet pet) {
            this.pet = pet;
        }
        //1
        @Override
        public void makeSound() {
            this.pet.makeSound();
            System.out.println("Gav-Gav");
        }

        @Override
        public String getName() {
            return this.pet.getName();
        }

        @Override
        public void nameChange(String name) {
            super.nameChange(name);
        }
}
