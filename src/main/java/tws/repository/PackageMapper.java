package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import tws.entity.Package;

import java.util.List;

@Mapper
public interface PackageMapper {
    List<Package> select();
    void insert(Package packageItem);
}
