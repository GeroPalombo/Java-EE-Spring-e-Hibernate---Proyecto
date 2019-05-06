package com.jee.eagenda.negocio.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jee.eagenda.modelos.Cliente;
import com.jee.eagenda.negocio.repositorio.ClienteRepositorio;

/**
 * Clase para definir los servicios de cliente
 * 
 * @author GeroPalombo
 *
 */
@Service
@Transactional(readOnly = true)
public class ClienteService {
	private final ClienteRepositorio clienteRepository;

	public ClienteService(ClienteRepositorio clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	/**
	 * Método para realizar la operación de guardar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de actualizar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de eliminar un cliente
	 * 
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	/**
	 * Método para consultar un cliente por su identificación
	 * 
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	
	/**
	 * Método para consultar todos los clientes
	 * @return
	 */
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
	/**
	 * Método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli){
		return this.clienteRepository.findByApellidoCli(apellidoCli);
	}
	
	
	/**
	 * Método para buscar un cliente por su cuenta de email
	 * @param email
	 * @return
	 */
	public Cliente findByEmailAccount(String email) {
		return this.findByEmailAccount(email);
	}

}