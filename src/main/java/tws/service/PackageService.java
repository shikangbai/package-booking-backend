package tws.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Package;
import tws.repository.PackageMapper;

import java.util.List;

@Service
public class PackageService {
    private Logger logger = LoggerFactory.getLogger(PackageService.class);
    @Autowired
    private PackageMapper packageMapper;
    public List<Package> select() {
        List<Package> packages = null;
        try {
            packages = packageMapper.select();
        }catch (Exception e) {
            logger.info(e.getMessage());
        }
        return packages;
    }

    public void insert(Package packageItem) {
        packageMapper.insert(packageItem);
    }
}
