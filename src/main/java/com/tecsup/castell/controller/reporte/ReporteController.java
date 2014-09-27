package com.tecsup.castell.controller.reporte;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reporte")
public class ReporteController {
    
    @RequestMapping("excel")    
    public String excel(Model model) {        
        Map<String,String> notas = new HashMap<String, String>();
        notas.put("Pablo","12");
        notas.put("Eduardo","10.5");
        notas.put("Milton","10.2");
        notas.put("Gino","11");        
        model.addAttribute("reporteNotas",notas);        
        return "excelView";
    }    
    
    @RequestMapping("pdf")    
    public String pdf(Model model) {        
        Map<String,String> notas = new HashMap<String, String>();
        notas.put("Pablo","15");
        notas.put("Eduardo","15");
        notas.put("Milton","15");
        notas.put("Gino","14");        
        model.addAttribute("reporteNotas",notas);        
        return "pdfView";
    }    
    
}
