package br.edu.infnet.processolicitatorio.modelo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.processolicitatorio.modelo.entidade.ProcessoLicitatorio;
import br.edu.infnet.processolicitatorio.modelo.repository.ProcessoLicitatorioRepository;

@Service
public class ProcessoLicitatorioService {
	
	@Autowired
	private ProcessoLicitatorioRepository processoLicitatorioRepository;
	
    public void incluir(ProcessoLicitatorio processoLicitatorio) {
        processoLicitatorioRepository.save(processoLicitatorio);
    }
    
    public void alterar(Long id, ProcessoLicitatorio processoLicitatorio) {
    	ProcessoLicitatorio processoLicitatorioSalvo = processoLicitatorioRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(processoLicitatorio, processoLicitatorioSalvo, "id");
        processoLicitatorioRepository.save(processoLicitatorioSalvo);
    }
    
    public void excluir(Long id) {
    	processoLicitatorioRepository.deleteById(id);
    }    
	
	public List<ProcessoLicitatorio> listarTodos(){
		return (List<ProcessoLicitatorio>) processoLicitatorioRepository.findAll(); 
	}
	
	public ProcessoLicitatorio buscarPeloId(Long id) {
		ProcessoLicitatorio processoLicitatorio = processoLicitatorioRepository.findById(id).get();
		return processoLicitatorio;
	}	

}
