package kz.narxoz.canvas.repository;

import kz.narxoz.canvas.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}