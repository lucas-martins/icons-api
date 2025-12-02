package com.lucas.icons_api.storage;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class StorageService {

    private final String escudosDir = "uploads/escudos/";
    private final String bandeirasDir = "uploads/bandeiras/";

    public String salvarEscudo(MultipartFile file, String nomeFinal) throws IOException {
        return salvarArquivo(file, escudosDir, nomeFinal);
    }

    public String salvarBandeira(MultipartFile file, String nomeFinal) throws IOException {
        return salvarArquivo(file, bandeirasDir, nomeFinal);
    }

    private String salvarArquivo(MultipartFile file, String dir, String nomeFinal) throws IOException {
        File pasta = new File(dir);
        if (!pasta.exists()) pasta.mkdirs();

        File destino = new File(dir + nomeFinal);
        file.transferTo(destino);

        return "/" + dir + nomeFinal;
    }
}
