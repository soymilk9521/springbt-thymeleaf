package com.example.springbthyme.controller;

import com.example.springbthyme.entity.BookBean;
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

    @RequestMapping("/book")
    public String getJavaCore(@RequestParam(value = "core", required = false) String core, Model model) {
        logger.info("core",core);
        model.addAttribute("core", core);
        return "books/book";
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public String showbooks(@ModelAttribute("book")BookBean book, BindingResult result, Model model) {
        logger.info("book", book);
        if (result.hasErrors()) {
            return "error";
        }else {
            model.addAttribute("book", book);
            return "books/book";
        }
    }

    @RequestMapping("bookBean")
    public String passBook(Model model){
        BookBean bookBean = new BookBean("javacript", "karl", "222");
        model.addAttribute("bookBean", bookBean);
        return "books/book";
    }
}