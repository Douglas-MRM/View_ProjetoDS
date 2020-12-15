package view;

import com.placeholder.PlaceHolder;
import dao.FornecedorDao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Fornecedor;

/**
 *
 * @author Sara
 */
public class viewFornecedor extends javax.swing.JDialog {

    PlaceHolder holder;

    public viewFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();

        btAtualizar.setVisible(false);
        holder = new PlaceHolder(edPesquisa, Color.GRAY, new Color(24, 14, 14), "Digite o Nome Fantasia do Fornecedor", isUndecorated(), "Segoe UI", 14);

    }

    public void preencherTabela() {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> fornList = fdao.listAll();
        DefaultTableModel modelo = (DefaultTableModel) tbFornecedor.getModel();
        modelo.setRowCount(0);
        for (Fornecedor forn : fornList) {
            modelo.addRow(new Object[]{forn.getId_fornecedor(), forn.getTradename(), forn.getCompanyname(), forn.getCnpj(),
                forn.getCep(), forn.getCity(), forn.getState(), forn.getCountry(), forn.getAdress(),
                forn.getPhonenumber(), forn.getDescription()});
        }
    }

    public void preencherTabela(String NomePesquisa) {
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> fornList = fdao.listAll(NomePesquisa);
        DefaultTableModel modelo = (DefaultTableModel) tbFornecedor.getModel();
        modelo.setRowCount(0);
        for (Fornecedor forn : fornList) {
            modelo.addRow(new Object[]{forn.getId_fornecedor(), forn.getTradename(), forn.getCompanyname(), forn.getCnpj(),
                forn.getCep(), forn.getCity(), forn.getState(), forn.getCountry(), forn.getAdress(),
                forn.getPhonenumber(), forn.getDescription()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelGuias = new javax.swing.JTabbedPane();
        Panel_Fornecedor = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFornecedor = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        Panel_Cadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        edNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edCnpj = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        edEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        edCod = new javax.swing.JTextField();
        edCep = new javax.swing.JFormattedTextField();
        edTelefone = new javax.swing.JFormattedTextField();
        cbEstado = new javax.swing.JComboBox<>();
        cbCidade = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedor");

        Panel_Fornecedor.setBackground(new java.awt.Color(102, 102, 102));

        btNew.setBackground(new java.awt.Color(255, 255, 255));
        btNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btNew.setText("NOVO");
        btNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNewMouseExited(evt);
            }
        });
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(255, 255, 255));
        btDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btDelete.setText("DELETAR");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDeleteMouseExited(evt);
            }
        });
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        tbFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Fantasia", "Razão Social", "CNPJ", "CEP", "Cidade", "Estado", "País", "Endereço", "Telefone", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbFornecedor);

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEditarMouseExited(evt);
            }
        });
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N

        edPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edPesquisa.setBorder(null);
        edPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(edPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(edPesquisa)
        );

        javax.swing.GroupLayout Panel_FornecedorLayout = new javax.swing.GroupLayout(Panel_Fornecedor);
        Panel_Fornecedor.setLayout(Panel_FornecedorLayout);
        Panel_FornecedorLayout.setHorizontalGroup(
            Panel_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FornecedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_FornecedorLayout.createSequentialGroup()
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Panel_FornecedorLayout.setVerticalGroup(
            Panel_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_FornecedorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Panel_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        PainelGuias.addTab("Fornecedor", Panel_Fornecedor);

        Panel_Cadastrar.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Fantasia:");

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalvarMouseExited(evt);
            }
        });
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarMouseExited(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CNPJ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Razão Social");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CEP");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cidade");

        try {
            edCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereço");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descrição");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("País");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Número de Telefone");

        btAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btAtualizar.setText("ATUALIZAR");
        btAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtualizarMouseExited(evt);
            }
        });
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código");

        edCod.setEditable(false);

        try {
            edCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            edTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará ", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        cbEstado.setSelectedIndex(-1);

        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta Floresta d’Oeste", "Alto Alegre dos Parecis", "Alto Paraíso", "Alvorada d’Oeste", "Ariquemes", "Buritis", "Cabixi", "Cacaulândia", "Cacoal", "Campo Novo de Rondônia", "Candeias do Jamari", "Castanheiras", "Cerejeiras", "Chupinguaia", "Colorado do Oeste", "Corumbiara", "Costa Marques", "Cujubim", "Espigão d’Oeste", "Governador Jorge Teixeira", "Guajará-Mirim", "Itapuã do Oeste", "Jaru", "Ji-Paraná", "Machadinho d’Oeste", "Ministro Andreazza", "Mirante da Serra", "Monte Negro", "Nova Brasilândia d’Oeste", "Nova Mamoré", "Nova União", "Novo Horizonte do Oeste", "Ouro Preto do Oeste", "Parecis", "Pimenta Bueno", "Pimenteiras do Oeste", "Porto Velho", "Presidente Médici", "Primavera de Rondônia", "Rio Crespo", "Rolim de Moura", "Santa Luzia d’Oeste", "São Felipe d’Oeste", "São Francisco do Guaporé", "São Miguel do Guaporé", "Seringueiras", "Teixeirópolis", "Theobroma", "Urupá", "Vale do Anari", "Vale do Paraíso", "Vilhena" }));
        cbCidade.setSelectedIndex(-1);

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abecásia", "Afeganistão", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Antígua e Barbuda", "Arábia Saudita", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Belize", "Benim", "Bielorrússia", "Bolívia", "Bósnia", "Botswana", "Brasil", "Brunei", "Bulgária", "Burkina Faso", "Burundi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Cingapura", "Colômbia", "Comores", "Congo", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba" }));
        cbPais.setSelectedIndex(-1);

        javax.swing.GroupLayout Panel_CadastrarLayout = new javax.swing.GroupLayout(Panel_Cadastrar);
        Panel_Cadastrar.setLayout(Panel_CadastrarLayout);
        Panel_CadastrarLayout.setHorizontalGroup(
            Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CadastrarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_CadastrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CadastrarLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(edRazaoSocial))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CadastrarLayout.createSequentialGroup()
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(edCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(edCod, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CadastrarLayout.createSequentialGroup()
                                .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edTelefone)
                            .addComponent(edCep)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CadastrarLayout.createSequentialGroup()
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CadastrarLayout.createSequentialGroup()
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNomeFantasia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(112, 112, 112))
        );
        Panel_CadastrarLayout.setVerticalGroup(
            Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CadastrarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_CadastrarLayout.createSequentialGroup()
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_CadastrarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbPais)
                            .addComponent(cbCidade))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(edDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(Panel_CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        PainelGuias.addTab("Cadastro", Panel_Cadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelGuias, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed

        PainelGuias.setSelectedIndex(1);
        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
    }//GEN-LAST:event_btNewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int indice = tbFornecedor.getSelectedRow();

        if (indice >= 0) {
            Fornecedor f = new Fornecedor();
            f.setId_fornecedor(Integer.parseInt(tbFornecedor.getValueAt(indice, 0).toString()));
            f.setTradename(tbFornecedor.getValueAt(indice, 1).toString());
            f.setCompanyname(tbFornecedor.getValueAt(indice, 2).toString());
            f.setCnpj(tbFornecedor.getValueAt(indice, 3).toString());
            f.setCep(tbFornecedor.getValueAt(indice, 4).toString());
            f.setCity(tbFornecedor.getValueAt(indice, 5).toString());
            f.setState(tbFornecedor.getValueAt(indice, 6).toString());
            f.setCountry(tbFornecedor.getValueAt(indice, 7).toString());
            f.setAdress(tbFornecedor.getValueAt(indice, 8).toString());
            f.setPhonenumber(tbFornecedor.getValueAt(indice, 9).toString());
            f.setDescription(tbFornecedor.getValueAt(indice, 10).toString());

            FornecedorDao fdao = new FornecedorDao();
            fdao.delete(f);
            preencherTabela();

        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABLEA");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        int ind = cbPais.getSelectedIndex();
        int ind1 = cbEstado.getSelectedIndex();
        int ind2 = cbCidade.getSelectedIndex();

        if (edNomeFantasia.getText().isEmpty() || edTelefone.getText().isEmpty() || edRazaoSocial.getText().isEmpty() || edCnpj.getText().isEmpty() || edCep.getText().isEmpty() || ind2 == -1 || ind == -1 || ind1 == -1 || edEndereco.getText().isEmpty() || edDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Fornecedor f = new Fornecedor();
            f.setTradename(edNomeFantasia.getText());
            f.setCompanyname(edRazaoSocial.getText());
            f.setCnpj(edCnpj.getText());
            f.setCep(edCep.getText());
            f.setCountry(cbPais.getSelectedItem().toString());
            f.setState(cbEstado.getSelectedItem().toString());
            f.setCity(cbCidade.getSelectedItem().toString());
            f.setAdress(edEndereco.getText());
            f.setPhonenumber(edTelefone.getText());
            f.setDescription(edDescricao.getText());

            FornecedorDao fdao = new FornecedorDao();
            fdao.insert(f);
            preencherTabela();

            btCancelarActionPerformed(evt);
            PainelGuias.setSelectedIndex(0);
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int ind = cbPais.getSelectedIndex();
        int ind1 = cbEstado.getSelectedIndex();
        int ind2 = cbCidade.getSelectedIndex();

        if (edNomeFantasia.getText().isEmpty() || edTelefone.getText().isEmpty() || edRazaoSocial.getText().isEmpty() || edCnpj.getText().isEmpty() || edCep.getText().isEmpty() || ind2 == -1 || ind == -1 || ind1 == -1 || edEndereco.getText().isEmpty() || edDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");

        } else {
            Fornecedor f = new Fornecedor();
            f.setId_fornecedor(Integer.parseInt(edCod.getText()));
            f.setTradename(edNomeFantasia.getText());
            f.setCompanyname(edRazaoSocial.getText());
            f.setCnpj(edCnpj.getText());
            f.setCep(edCep.getText());
            f.setCountry(cbPais.getSelectedItem().toString());
            f.setState(cbEstado.getSelectedItem().toString());
            f.setCity(cbCidade.getSelectedItem().toString());
            f.setAdress(edEndereco.getText());
            f.setPhonenumber(edTelefone.getText());
            f.setDescription(edDescricao.getText());

            FornecedorDao fdao = new FornecedorDao();
            fdao.update(f);
            preencherTabela();

            btCancelarActionPerformed(evt);
            PainelGuias.setSelectedIndex(0);
        }

    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        btSalvar.setVisible(false);
        btAtualizar.setVisible(true);
        int indice = tbFornecedor.getSelectedRow();

        if (indice >= 0) {
            edCod.setText(tbFornecedor.getValueAt(indice, 0).toString());
            edNomeFantasia.setText(tbFornecedor.getValueAt(indice, 1).toString());
            edRazaoSocial.setText(tbFornecedor.getValueAt(indice, 2).toString());
            edCnpj.setText(tbFornecedor.getValueAt(indice, 3).toString());
            edCep.setText(tbFornecedor.getValueAt(indice, 4).toString());
            cbCidade.setSelectedItem(tbFornecedor.getValueAt(indice, 5));
            cbEstado.setSelectedItem(tbFornecedor.getValueAt(indice, 6));
            cbPais.setSelectedItem(tbFornecedor.getValueAt(indice, 7));
            edEndereco.setText(tbFornecedor.getValueAt(indice, 8).toString());
            edTelefone.setText(tbFornecedor.getValueAt(indice, 9).toString());
            edDescricao.setText(tbFornecedor.getValueAt(indice, 10).toString());

            PainelGuias.setSelectedIndex(1);

        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UMA LINHA DA TABLEA");
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        edCod.setText(null);
        edNomeFantasia.setText(null);
        edRazaoSocial.setText(null);
        edCnpj.setText(null);
        edCep.setText(null);
        cbCidade.setSelectedIndex(-1);
        cbEstado.setSelectedIndex(-1);
        cbPais.setSelectedIndex(-1);
        edEndereco.setText(null);
        edTelefone.setText(null);
        edDescricao.setText(null);

        PainelGuias.setSelectedIndex(0);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseEntered
        btNew.setBackground(new Color(30, 144, 255));
        btNew.setForeground(Color.WHITE);
    }//GEN-LAST:event_btNewMouseEntered

    private void btNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNewMouseExited
        btNew.setBackground(new Color(235, 235, 235));
        btNew.setForeground(Color.BLACK);
    }//GEN-LAST:event_btNewMouseExited

    private void btDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseEntered
        btDelete.setBackground(Color.RED);
        btDelete.setForeground(Color.WHITE);
    }//GEN-LAST:event_btDeleteMouseEntered

    private void btDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseExited
        btDelete.setBackground(Color.WHITE);
        btDelete.setForeground(Color.BLACK);
    }//GEN-LAST:event_btDeleteMouseExited

    private void btEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseEntered
        btEditar.setBackground(Color.GREEN);
        btEditar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btEditarMouseEntered

    private void btEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseExited
        btEditar.setBackground(Color.WHITE);
        btEditar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btEditarMouseExited

    private void btSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseEntered
        btSalvar.setBackground(new Color(30, 144, 255));
        btSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSalvarMouseEntered

    private void btSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseExited
        btSalvar.setBackground(new Color(235, 235, 235));
        btSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btSalvarMouseExited

    private void btAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseEntered
        btAtualizar.setBackground(Color.GREEN);
        btAtualizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btAtualizarMouseEntered

    private void btAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseExited
        btAtualizar.setBackground(Color.WHITE);
        btAtualizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btAtualizarMouseExited

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered
        btCancelar.setBackground(Color.RED);
        btCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btCancelarMouseEntered

    private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
        btCancelar.setBackground(Color.WHITE);
        btCancelar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btCancelarMouseExited

    private void edPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisaKeyPressed
        preencherTabela(edPesquisa.getText());
    }//GEN-LAST:event_edPesquisaKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewFornecedor dialog = new viewFornecedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PainelGuias;
    private javax.swing.JPanel Panel_Cadastrar;
    private javax.swing.JPanel Panel_Fornecedor;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JFormattedTextField edCep;
    private javax.swing.JFormattedTextField edCnpj;
    private javax.swing.JTextField edCod;
    private javax.swing.JTextField edDescricao;
    private javax.swing.JTextField edEndereco;
    private javax.swing.JTextField edNomeFantasia;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edRazaoSocial;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFornecedor;
    // End of variables declaration//GEN-END:variables
}
