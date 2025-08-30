public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private  int shampoo = 10;

    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o Pet na maquina para iniciar o banho ");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "foi removido da máquina ");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade da água da máquina esta no máximo");
            return;
        }
        water += 2;
    }

    public void addShanpoo(){
        if (shampoo == 30){
            System.out.println("A capacidade do shampoo da máquina esta no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, para colcoar o pet é necessárop limpa-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " esta na máquina nesse momento ");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " esta limpo ");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa");
    }
}
