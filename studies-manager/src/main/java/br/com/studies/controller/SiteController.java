package br.com.studies.controller;

import br.com.studies.model.Site;
import br.com.studies.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sites")
public class SiteController {

    @Autowired
    private SiteService service;

    @PostMapping("cadastrar")
    public Site cadastrar(Site site) {return service.save(site);}
}
