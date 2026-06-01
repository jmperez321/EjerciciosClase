package objetos2.Solution03;

import java.util.*;


class Author {
    String name;
    String photoURL;
}

class Post3 {
    Author author;
    String content;
}

class Stream {
    Post3[] posts;
}

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nPosts = sc.nextInt();

        Stream stream = new Stream();

        stream.posts = new Post3[nPosts];

        for (int i = 0; i < nPosts; i++) {

            stream.posts[i]=new Post3();
            stream.posts[i].author=new Author();

            stream.posts[i].author.name = sc.next();
            stream.posts[i].author.photoURL = sc.next();
            stream.posts[i].content = sc.next() + sc.nextLine();
        }

        for (int i = 0; i < nPosts; i++) {
            System.out.println(stream.posts[i].author.name);
            System.out.println(stream.posts[i].content);
            System.out.println("------------------------------");
        }
    }
}
