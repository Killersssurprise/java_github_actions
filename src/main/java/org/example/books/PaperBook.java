package org.example.books;

public class PaperBook extends BaseBook {

    private String material_type = "";
    private float weight;

    public PaperBook(String author, String name) {
        super(author, name);
    }

    public PaperBook(String author, int year, String name) {
        super(author, year, name);
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    public String getMaterial_type() {
        return material_type;
    }

    public float getWeight() {
        return weight;
    }

    public void setMaterial_type(String material_type) {
        this.material_type = material_type;
    }

    public void setWeight(float weight) {

        if(weight > 5.0f){
            System.out.println("Книга не может весить больше 5кг!!!!!");
            return;
        }
//        System.out.println("Я дошел до строки изменения цены!");
        this.weight = weight;
    }

//    @Override
//    public void print() {
//        super.print();
//    }

    @Override
    public void print() {
        super.print();

        System.out.println("Material_type: " + this.material_type);
        System.out.println("Weight: " + this.weight);
//        System.out.println();
    }

}
