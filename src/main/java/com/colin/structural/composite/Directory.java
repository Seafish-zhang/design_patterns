package com.colin.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zhy
 * @date 2020/5/26
 */
public class Directory extends FileSystemNode {

  private List<FileSystemNode> subNodes = new ArrayList<>();

  public Directory(String path) {
    super(path);
  }

  @Override
  public int countNumOfFiles() {
    int numOfFiles = 0;
    for (FileSystemNode subNode : subNodes) {
      numOfFiles += subNode.countNumOfFiles();
    }
    return numOfFiles;
  }

  @Override
  public long countSizeOfFiles() {
    long sizeOfFiles = 0;
    for (FileSystemNode subNode : subNodes) {
      sizeOfFiles += subNode.countSizeOfFiles();
    }
    return sizeOfFiles;
  }

  public void addSubNode(FileSystemNode fileSystemNode) {
    subNodes.add(fileSystemNode);
  }

  public void removeSubNode(FileSystemNode fileSystemNode) {
    int size = subNodes.size();
    int i = 0;
    for (; i < size; i++) {
      if (subNodes.get(i).getPath().equalsIgnoreCase(fileSystemNode.getPath())) {
        break;
      }
    }
    if (i < size) {
      subNodes.remove(i);
    }
  }
}
