package az.ingress.service.impl;

import az.ingress.dao.entity.Product;
import az.ingress.dao.repository.ProductRepository;
import az.ingress.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
