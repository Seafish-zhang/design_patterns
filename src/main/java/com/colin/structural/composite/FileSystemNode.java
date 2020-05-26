package com.colin.structural.composite;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public abstract class FileSystemNode {

  protected String path;

  public FileSystemNode(String path) {
    this.path = path;
  }

  public String getPath() {
    return this.path;
  }

  public abstract int countNumOfFiles();

  public abstract long countSizeOfFiles();
}
