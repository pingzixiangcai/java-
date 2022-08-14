package movie;

public class Test {
    public static void main(String[] args) {
//        1. 设计3个电影类
//        2. 创建三个电影对象
//        3. 创建一个电影类型的数组，存放三个电影对象
        Movie[] movies = new Movie[3];
        movies[0]=new Movie("小王子",9.9,"王子");
        movies[1]=new Movie("仙剑奇侠传",9.8,"胡歌");
        movies[2]=new Movie("怦然心动",10.0,"小可爱~");

        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名字："+m.getName());
            System.out.println("电影分数："+m.getScorces());
            System.out.println("电影演员："+m.getActors());
            System.out.println("----------------------------------------");
        }






    }

}
