package tws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Package;
import tws.service.PackageService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/packages")
@CrossOrigin("*")
public class PackageController {
    private Logger logger = LoggerFactory.getLogger(PackageService.class);
    @Autowired
    private PackageService packageService;
    @GetMapping()
    private ResponseEntity<List<Package>> getPackageList() {
        return ResponseEntity.ok(packageService.select());
    }
    @PostMapping()
    private ResponseEntity<String> addPackage(@RequestBody @Valid Package packageItem) {
        try {
            packageService.insert(packageItem);
        }catch (Exception e) {
            logger.info(e.getMessage());
            return ResponseEntity.ok("创建失败");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("创建成功");
    }
}
