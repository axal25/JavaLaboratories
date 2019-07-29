package utils;

import utils.exceptions.FileInHandlersException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileInHandlers {
    public File file;
    public FileReader fileReader;
    public BufferedReader bufferedReader;

    public FileInHandlers() {
        set(null, null, null);
    }

    public FileInHandlers(File file, FileReader fileReader, BufferedReader bufferedReader) {
        set(file, fileReader, bufferedReader);
    }

    public FileInHandlers set(File file, FileReader fileReader, BufferedReader bufferedReader) {
        this.file = file;
        this.fileReader = fileReader;
        this.bufferedReader = bufferedReader;
        return this;
    }

    public FileInHandlers open(File file) {
        if( file != null ) {
            fileReader = utils.FilesOp.openFileReader( file );
            bufferedReader = utils.FilesOp.openBufferedReader( fileReader );
            set( file, fileReader, bufferedReader );
        }
        return this;
    }

    public FileInHandlers close(File file, FileReader fileReader, BufferedReader bufferedReader ) {
        final String functionName = "close(File file, FileReader fileReader, BufferedReader bufferedReader )";
        if( file == null || fileReader == null || bufferedReader == null ) {
            String message = "file == null || fileReader == null || bufferedReader == null";
            if( file == null ) message += "\n\r" + "file == null";
            if( fileReader == null ) message += "\n\r" + "fileReader == null";
            if( bufferedReader == null ) message += "\n\r" + "bufferedReader == null";
            try {
                throw new FileInHandlersException( this.getClass().getName(), functionName, message);
            } catch (FileInHandlersException e) {
                String exceptionMessage = ExceptionMessageGenerator.getMessage(FilesOp.class.getName(), functionName, e);
                System.out.println(exceptionMessage);
            }
        }
        fileReader = utils.FilesOp.closeFileReader( fileReader );
        bufferedReader = utils.FilesOp.closeBufferedReader( bufferedReader );
        set( file, fileReader, bufferedReader );
        return this;
    }

    public FileInHandlers close() {
        return this.close( this.file, this.fileReader, this.bufferedReader );
    }
}
