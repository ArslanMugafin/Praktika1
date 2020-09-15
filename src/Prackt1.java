public class Prackt1 {
    public static void main(String[] args){
        Box wind1 = new Box();
        wind1.Num = 1;
        wind1.x1 = -0.5;
        wind1.y1 = -2;
        wind1.x2 = 1.4;
        wind1.y2 = 3.7;
        Box wind2 = new Box();
        wind2.Num = 2;
        wind2.x1 = 0;
        wind2.y1 = -5;
        wind2.x2 = 3.4;
        wind2.y2 = 7.7;
        Box wind3 = new Box();
        wind3.Num = 3;
        wind3.x1 = -2.5;
        wind3.y1 = -4;
        wind3.x2 = 4.4;
        wind3.y2 = 6.7;
        Box wind4 = new Box();
        wind4.Num = 4;
        wind4.x1 = -3;
        wind4.y1 = -8;
        wind4.x2 = 8;
        wind4.y2 = 7.7;
        Box wind5 = new Box();
        wind5.Num = 5;
        wind5.x1 = -10;
        wind5.y1 = -10;
        wind5.x2 = 10;
        wind5.y2 = 10;
        Box[] box = new Box[5];
        box[0]=wind1;
        box[1]=wind2;
        box[2]=wind3;
        box[3]=wind4;
        box[4]=wind5;
        if (args.length>4)
            System.out.println("Ошибка");
        else {if (args.length==0)
        {
            System.out.println("Название\n"+"Мугафин А.В.\n"+"Нужно ввести значение x и y и тогда программа выдаст номер компоненты которая используется.\n"+" Пример: -x 2 -y 5");
        }
        else {
            if (args[0].equals("-h") | args[0].equals("-help")){
                System.out.println("Название\n"+"Мугафин А.В.\n"+"Нужно ввести значение x и y и тогда программа выдаст номер компоненты которая используется.\n"+" Пример: -x 2 -y 5");
            } else {
                if (args[0].equals("-x") && args[2].equals("-y")){
                    double x = Double.parseDouble(args[1]);
                    double y = Double.parseDouble(args[3]);
                    System.out.print(x+"\n"+y+"\n");
                    int otvet = 0;
                    for (int i=0;i<5;i++){
                        if (x>=box[i].x1 && x<=box[i].x2 && y>=box[i].y1 && y<=box[i].y2){
                            otvet = box[i].Num;
                            System.out.print("Вы попали в поле "+box[i].Num);
                            break;
                        }
                    }
                    if (otvet==0)
                        System.out.print("вы никуда не попали");
                }
            }
        }
        }

    }
    public static class Box{
        public int Num;
        public double x1;
        public double y1;
        public double x2;
        public double y2;
    }
}