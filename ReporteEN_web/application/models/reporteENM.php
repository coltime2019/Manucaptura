<?php 
/**
 * 
 */
class reporteENM extends CI_Model 
{
	
	function __construct()
	{
		parent::__construct();
	}

	public function estadoDeConexionServidorM()
	{
		# code...
	}

	public function estructurarEncabezadoM()
	{
		$this->load->database();

		$query = $this->db->query("CALL PA_ConsultarPRocesosReporteENoTE(3);");//El 3 hace referencia 

		$result= $query->result();

		$this->db->close();

		return $result;
	}

	public function consultarInformacionCuerpoTablaM()
	{
		$this->load->database();

		$query = $this->db->query("CALL PA_InformeNEN();");

		$result= $query->result();

		$this->db->close();

		return $result;
	}

	public function consultarNombreLiderProyectoENM($documento)
	{
		$db_sgn= $this->load->database('sgn',true);

		$query = $db_sgn->query("CALL PA_ConsultarEmpleadosColtime('{$documento}','');");

		$row= $query->row();

		$db_sgn->close();

		return $row;
	}
}
 ?>