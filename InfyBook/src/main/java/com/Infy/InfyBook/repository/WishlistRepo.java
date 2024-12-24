package com.Infy.InfyBook.repository;

import com.Infy.InfyBook.model.WishListBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WishlistRepo extends JpaRepository<WishListBook, UUID> {
}
