package Pessoas;

import java.io.Serializable;

public class pessoas implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer NUMERO_DA_VENDA;
		private String NOME_DO_CLIENTE;
		private String DATA_DA_VENDA;
		private String VALOR_DA_VENDA;
		
		public pessoas() {
		}

		public pessoas(Integer NUMERO_DA_VENDA, String NOME_DO_CLIENTE, String DATA_DA_VENDA, String VALOR_DA_VENDA) {
			super();
			this.NUMERO_DA_VENDA = NUMERO_DA_VENDA;
			this.NOME_DO_CLIENTE = NOME_DO_CLIENTE;
			this.DATA_DA_VENDA = DATA_DA_VENDA;
			this.VALOR_DA_VENDA = VALOR_DA_VENDA;
		}

		public Integer getNUMERO_DA_VENDA() {
			return NUMERO_DA_VENDA;
		}

		public void setName(Integer NUMERO_DA_VENDA) {
			this.NUMERO_DA_VENDA = NUMERO_DA_VENDA;
		}

		public String getNOME_DO_CLIENTE() {
			return NOME_DO_CLIENTE;
		}

		public void setNOME_DO_CLIENTE(String NOME_DO_CLIENTE) {
			this.NOME_DO_CLIENTE = NOME_DO_CLIENTE;
		}

		public String getDATA_DA_VENDA() {
			return DATA_DA_VENDA;
		}

		public void setDATA_DA_VENDA(String DATA_DA_VENDA) {
			this.DATA_DA_VENDA = DATA_DA_VENDA;
		}
		
		public String getVALOR_DA_VENDA() {
			return VALOR_DA_VENDA;
		}

		public void setVALOR_DA_VENDA(String VALOR_DA_VENDA) {
			this.VALOR_DA_VENDA = VALOR_DA_VENDA;
		}

		@Override
		public String toString() {
			return "Product [NUMERO_DA_VENDA=" + NUMERO_DA_VENDA + ",NOME_DO_CLIENTE=" +NOME_DO_CLIENTE +",DATA_DA_VENDA="+ DATA_DA_VENDA + ",VALOR_DA_VENDA=" + VALOR_DA_VENDA + "]";
	}
}