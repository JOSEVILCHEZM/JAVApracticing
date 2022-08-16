//LO QUE HACE ESTO ES RETORNAR UN VALOR
// EN VEZ DE QUE SE EJECUTE UNA FUCNION LO QUE PUEDE HACER ES RETORNARTE UN VALOR 

// CUANDO PONEMOS VOID SIGNIFICA QUE LA FUNCION VA A EJECUTARSE, NO VA A RETORNAR
// SE CAMBIA CON EL TIPO DE DATO QUE VA A RETORNAR, EJEMLO LA SUMA VA RETORNAR UN ENTERO

public class FuncionConRetorno {

    public static void main(String[] args) {
        var suma = sumar(10, 40);

        System.out.println("LA SUMA ES : " + sumar(45, 45));
    }

    static int sumar(int a, int b) {

        return a + b;
    }
}
