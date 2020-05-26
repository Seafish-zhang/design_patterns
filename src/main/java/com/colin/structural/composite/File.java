package com.colin.structural.composite;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class File extends FileSystemNode {

  public File(String path) {
    super(path);
  }

  @Override
  public int countNumOfFiles() {
    return 1;
  }

  @Override
  public long countSizeOfFiles() {
    java.io.File file = new java.io.File(path);
    if (file.exists()) {
      return file.length();
    } else {
      return 0;
    }
  }
}
