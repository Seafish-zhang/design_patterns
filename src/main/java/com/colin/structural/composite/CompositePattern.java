package com.colin.structural.composite;

/**
 * Description:组合（Composite）模式的定义：有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。
 * <p>
 * 组合模式的主要优点有：
 * <p>
 * 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码； 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 * <p>
 * <p>
 * 其主要缺点是：
 * <p>
 * 设计较复杂，客户端需要花更多时间理清类之间的层次关系； 不容易限制容器中的构件； 不容易用继承的方法来增加构件的新功能；
 *
 * @author zhy
 * @date 2020/5/26
 */
public class CompositePattern {

  public static void main(String[] args) {
    Directory directory = new Directory("F:\\file");
    Directory subDirectory1 = new Directory("F:\\file\\1");
    Directory subDirectory2 = new Directory("F:\\file\\2");
    directory.addSubNode(subDirectory1);
    directory.addSubNode(subDirectory2);

    File file1 = new File("F:\\file\\1\\1.txt");
    File file2 = new File("F:\\file\\1\\2.txt");
    File file3 = new File("F:\\file\\2\\3.txt");
    subDirectory1.addSubNode(file1);
    subDirectory1.addSubNode(file2);
    subDirectory2.addSubNode(file3);

    System.out.println(
        "directory [numOfFiles is " + directory.countNumOfFiles() + " sizeOfFiles is " + directory
            .countSizeOfFiles() + " ]");
    System.out.println(
        "subDirectory1 [numOfFiles is " + subDirectory1.countNumOfFiles() + " sizeOfFiles is "
            + subDirectory1.countSizeOfFiles() + " ]");
    System.out.println(
        "subDirectory2 [numOfFiles is " + subDirectory2.countNumOfFiles() + " sizeOfFiles is "
            + subDirectory2.countSizeOfFiles() + " ]");

  }
}
