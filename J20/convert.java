packagecom.pcwk.ex03.reader_writer;importjava.io.*;importcom.pcwk.cmn.LoggerManager;publicclassFileReaderWriterEx01implementsLoggerManager{publicstaticvoidmain(String[]args){//특수문자//\n:라인스킵//\t:tab문자//'':space문자StringfilePath="/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex03/reader_writer/FileReaderWriterEx01.java";try(FileReaderfr=newFileReader(filePath);FileWriterfw=newFileWriter("convert.java");){intdata=0;while((data=fr.read())!=-1){if('\n'!=data&&''!=data&&'\r'!=data&&'\t'!=data){fw.write(data);}}}catch(IOExceptione){LOG.debug("==============");LOG.debug(e.getMessage());LOG.debug("==============");}LOG.debug("프로그램완료");}}