package objetos2.Solution12;

public class Grade {
    String name;
    float grade;
    float weight;

    Grade(String n, float g, float w) {
        name = n;
        if (g<0||w<0){
            throw new NoNegativException("No puede ser negativo");
        }
        grade = g;
        weight = w;
    }
}