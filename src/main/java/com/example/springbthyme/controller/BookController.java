package com.example.springbthyme.controller;

import com.example.springbthyme.domain.BookBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/books")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @RequestMapping("/java")
    public String getJavaCore(@RequestParam(value = "core", required = false) String core, Model model) {
        logger.info("core",core);
        model.addAttribute("core", core);
        return "books/java";
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public String showbooks(@ModelAttribute("book")BookBean book, BindingResult result, Model model) {
        logger.info("book", book);
        if (result.hasErrors()) {
            return "error";
        }else {
            model.addAttribute("book", book);
            return "books/java";
        }
    }

    @RequestMapping("obj")
    public String passBook(Model model){
        BookBean bean = new BookBean();
        bean.setName("Javascript");
        bean.setAuthor("Martin");
        bean.setPrice("222");
        model.addAttribute("bean",bean );
        return "books/java";
    }
}