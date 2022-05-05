import java.util.Scanner;
public class fecha {
    public static void main(String []args){
        Scanner leer=new Scanner(System.in);
        System.out.print(" \n1=Lunes\n2=Martes\n3=Miercoles\n4=Jueves\n5=Viernes\n6=Sabado\n7=Domingo\n Digite el dia adecuado: ");
        int dia= leer.nextInt();
        String diaS;
         
        
        switch (dia) 
        {
            case 1:  diaS = "Lunes";
                     break;
            case 2:  diaS = "Martes";
                     break;
            case 3:  diaS = "Miercoles";
                     break;
            case 4:  diaS = "Jueves";
                     break;
            case 5:  diaS = "Viernes";
                     break;
            case 6:  diaS = "Sabado";
                     break;
            case 7:  diaS = "Domingo";
                     break;
            default: diaS = "Dia inválido";
                     break;
        }
        System.out.print(" \n1=Enero\n2=Febrero\n3=Marzo\n4=Abril\n5=Mayo\n6=Junio\n7=Julio\n8=Agosto\n=9septiembre\n10=Octubre\n11=Noviembre\n12=Diciembre\nDigite el mes adecuado: ");
        int mes= leer.nextInt();
        
        String MesS;
        switch (mes)
                {
            case 1:  MesS = "Enero";
                     break;
            case 2:  MesS = "Febrero";
                     break;
            case 3:  MesS = "Marzo";
                     break;
            case 4:  MesS = "Abril";
                     break;
            case 5:  MesS = "Mayo";
                     break;
            case 6:  MesS = "Junio";
                     break;
            case 7:  MesS = "Julio";
                     break;
            case 8:  MesS = "Agosto";
                     break;
            case 9:  MesS = "Septiembre";
                     break;
            case 10:  MesS = "Octubre";
                     break;
            case 11:  MesS = "Noviembre";
                     break;   
            case 12:  MesS = "Diciembre";
                     break;           
                     
            default: MesS = "Mes inválido";
                     break;
        }
        System.out.print(" \n1=2018\n2=2019\n3=2020\n4=2021\n5=2022\nDigite el año adecuado: ");
        int año= leer.nextInt();
        
        String Aaño;
        switch (año){
            case 1:  Aaño = "2018";
                     break;
            case 2:  Aaño = "2019";
                     break;
            case 3:  Aaño = "2020";
                     break;
            case 4:  Aaño = "2021";
                     break;
            case 5:  Aaño = "2022";
                     break;
            default: Aaño = "año inválido";
                     break;         
        
        }
            
        System.out.println("Hoy es "+diaS+" Del mes "+MesS+" del año "+Aaño);
    }
}