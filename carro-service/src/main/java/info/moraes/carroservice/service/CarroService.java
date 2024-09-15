package info.moraes.carroservice.service;

import info.moraes.carroservice.model.Carro;
import info.moraes.carroservice.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarroService {
    private final CarroRepository carroRepository;
    public Carro create(Carro carro) {
        return carroRepository.save(carro);
    }
    public List<Carro> findAll() {
        return carroRepository.findAll();
    }
    public Optional<Carro> findById(Long id) {
        log.info("SERVICE-Find cerveja with id {}", id);
        return carroRepository.findById(id);
    }
    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }
    public Carro update(Carro carro) {
        return carroRepository.save(carro);
    }
}
