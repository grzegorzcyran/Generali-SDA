package edu.grcy.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class FileOperationPerformer {
    private final List<FileOperation> fileOperationsHistory
            = new ArrayList<>();

    public String executeOperation(FileOperation fileOperation, String content) {
        fileOperationsHistory.add(fileOperation);
        return fileOperation.performOperation(content);
    }

    public List<FileOperation> getFileOperationsHistory() {
        return fileOperationsHistory;
    }
}
