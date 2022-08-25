public class Main {
    public static void main(String[] args)
    {
        int i = 0;
        while(i < 11)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }

        System.out.println();


        int firstFriday = 6;
        while(firstFriday < 31)
        {
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
        }

        for(int a = 0; a < 2022 + 100; a = a + 79)
            if(a > 2022 - 200 || (a > 2022 - 200 && a < 2022 + 100)){
                System.out.println(a);
            }


        for(i = 0; i <= 30; i++){
            System.out.print(i);
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(" ping pong");
            }
            else if(i % 3 == 0){
                System.out.println(" ping");
            }
            else if(i % 5 == 0)
            {
                System.out.println(" pong");
            }
            else {
                System.out.println();
            }
        }

        System.out.println();

        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(i = 0; i < 8; i++){
            second = first + second;
            first = second - first;
            System.out.println(second);
        }
    }
}