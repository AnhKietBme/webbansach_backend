package vn.kietdeptrai.webbansach_backend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.kietdeptrai.webbansach_backend.dao.ChiTietDonHangRepository;
import vn.kietdeptrai.webbansach_backend.entity.ChiTietDonHang;

@RestController
public class TestController {
    private ChiTietDonHangRepository repository;
    @Autowired
    public TestController(ChiTietDonHangRepository repository){
        this.repository = repository;
    }
    @GetMapping("/")
    public void test() {
        ChiTietDonHang ctdh = new ChiTietDonHang();
        //repository.findById();
        repository.saveAndFlush(ctdh);
    }
}
