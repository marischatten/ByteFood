Byte_Food
https://www.devmedia.com.br/swing-componentes-mais-importantes-e-suas-propriedades/16113

Principalmente para quem está começando no Java e quer conhecer melhor a interface gráfica, este artigo mostrará alguns de seus componentes e suas propriedades. No início, é muito comum o programador querer utilizar um componente que faz determinada função, mas esse não tem certeza se o tal componente existe ou como utilizá-lo.

Antes de conhecermos os componentes e suas propriedades, vamos entender um pouco a diferença entre os componentes do pacote Swing e os componentes do pacote AWT.

Componentes AWT O pacote AWT (Abstract Windows Toolkit) possui os primeiros componentes gráficos que surgiram no java. Como janelas (Container, Frame, Panel...), alguns botões (Button, RadioButton, CheckBox...), Rótulos (Label), campos de texto (TextField), Listas (Choice, List,...) entre outros componentes. Esses componentes eram muito utilizados quando ainda não existia o pacote Swing. Eles possuem uma aparência mais "padrão", são mais quadrados e não possuem muitos efeitos gráficos.

Componentes Swing O pacote Swing é uma evolução do pacote AWT. Além de seus próprios componentes, esse pacote possui quase todos os componentes que já existiam no pacote AWT, porém com uma interface gráfica mais evoluida e com maiores efeitos. Os componentes Swing começam com a letra "J", assim um botão que no AWT se denomina Button, no Swing é JButton. Como dito antes, o pacote Swing possui componentes próprios, esses componentes estão entre telas mais aperfeiçoadas (JTabbedPane, JToolBar, JInternalFrame, JColorChooser...), novos botões e campos para dispor as informações na aplicação (JFormattedTextField, JProgressBar, JSpeener, JPasswordField, JTextPane, JTextArea...) e menus (JMenuBar, JMenu...).

Nesse primeiro artigo vamos conhecer um pouco mais dos componentes relacionados a Contêiners.

JToolBar A barra de ferramentas é utilizada para criar atalhos da aplicação. Assim como no Eclipse, por exemplo, temos os "play" verde para executar o aplicativo, podemos criar atalhos para nossos programas também.

barra de ferramentas

Propriedades mais utilizadas da JToolBar:

setAligmentY(float aligmentY) - Define o alinhamento da barra (normalmente no topo) add(Component comp) - Permite adicionar um botão (JButton) para ser o ícone de atalho da barra de ferramentas. JPanel O painel é um componente utilizado para fazer subdivisões na tela, ou para separar de forma organizada componentes dispostos na tela.

componentes

Propriedades mais utilizadas do JPanel:

setBackground(Color bg) - Define a cor do painel. A cor pode ser indicada por constantes da classe Color. Exemplo: Color.RED setBorder(Border border) - Define a borda do painel. A borda pode possuir título, ser mais espessa, mais densa, entre outras definições e é definida pela classe BorderFactory. Exemplo: BorderFactory.createTitledBorder("Título") add(Component comp) - Adiciona um componente no JPainel JTabbedPane O JTabbedPane permite agrupar vários JPanels em um único componente formando uma aba para cada painel.

JTabbedPane

Propriedade mais utilizadas do JTabbedPane:

addTab(String title, Component component) - adiciona um aba no componente, o primeiro parâmetro é o título da aba e o segundo é o componente que será parte da aba. Normalmente esse componente é o JPanel e dentro do JPanel vão os demais componentes da janela. addTab(String title, Icon icon, Component component) - tem o mesmo efeito que o método acima, porém permite setar um ícone para a aba. addTab(String title, Icon icon, Component component, String tip) - acrescenta ao método acima o ToolTipText, ultimo parâmetro do método. A String colococada no local do TipText será visível ao posicionar o cursor do mouse sobre o título da aba. JSplitPane O componente é semelhante a um JPanel possuindo dentro dele dois botões que fazem a divisão da tela.

JSplitPane

Propriedades mais utilizadas do JSplitPane:

setDividerLocation(double proportionalLocation) - define a porcentagem (entre 0 e 100) que a tela estará dividida. Para que ela esteja dividida ao meio deve ser especificado 100 %. setDividerSize(int newSize) - define o espaço em branco que se localiza entre os dois botões do JSpliPane. JScrollPane O painel de rolagem sempre é utilizado com algum outro componente, normalmente um componente para adicionar textos como o JTextArea (veremos o JTextArea no próximo capítulo). Esse componente adiciona barra de rolagens ao componente que se localiza dentro dele.

JScrollPane

Propriedades mais utilizada do JScrollPane:

.add(Component comp) - adiciona um componente na JScrollPane como por exemplo, um JPanel. A barra de rolagem aparece "automaticamente" de acordo com o componente que está dentro do painel de rolagem. Conforme vai aumentando o texto, por exemplo, maior fica a barra de rolagem.

Existem algumas propriedades que são comuns a vários componentes e também são bastante utilizadas. As propriedades comuns aos componentes acima estão descritas em seguida:

setSize(int width, int height) - define a largura e a altura do componente. setBackground(Color bg) - define a cor de fundo do componente. A cor pode ser especificada por constantes da classe Color. Exemplo: Color.RED. setForeground(Color fg) - define a cor da fonte do componente. A cor da fonte também pode ser especificada pelas constantes da classe Color. setLayout(LayoutManager layout) - define como será a distribuição dos demais componentes sobre o componente especificado. Existem vários layouts, como o FlowLayout(), BorderLayout(), NullLayout()., GridLayout() Esses layouts são classes. Para que o componente possua o layout especificado deve ser instanciada a classe correspondente a ele no parâmetro. setToolTipText(String text) - o texto definido no parâmetro será visualizado ao parar com o cursor do mouse sobre o componente. Normalmente especifica para que serve determinado campo ou janela. Botões e campos de controle de dados Sabemos que para desenvolver uma tela amigável para o usuário, são necessários diversos recursos visuais, entre eles botões, caixas de texto, locais para apresentar a saída e imagens.

Quanto mais organizada e distribuída for a tela, mais legível e confortável para se trabalhar.

Nesse artigo serão apresentados alguns dos principais componentes que são utilizados em janelas e suas respectivas propriedades.

JLabel O JLabel é utilizado para apresentar um texto "fixo" ao usuário. É muito comum utilizar o componente como rótulo para os demais componentes, ou seja, para identificar o que representa cada campo na tela. Pode ser utilizado também como saída de dados, onde o usuário irá visualizar o resultado final de alguma operação. O texto desse componente só pode ser alterado via código.

Propriedades mais utilizadas do JLabel:

setText(String text):define o texto que aparecerá no JLabel. setFont(Font fonte):permite alterar a fonte do JLabel. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setForeground(Color fg):define a cor da fonte. setIcon(IconImage icon):permite adicionar um ícone ao JLabel. Muitas vezes o JLabel possui apenas um ícone ou imagem para deixar a tela mais amigável ao usuário. O ícone é representado pela classe IconImage. Para criar um IconImage deve ser passado como parâmetro o caminho da imagem. JLabel

JTextField e JPasswordField O JTextField é um campo utilizado para a entrada de informações. Normalmente é uma caixa branca onde o usuário pode entrar com algum valor para que seja utilizado pelo algoritmo. O JPassowordField é idêntico ao JTextField com exceção de um fator, a aparência. O JPasswordField, como diz no nome, é um campo de senha. Assim, quando o usuário digita um texto esse texto fica codificado.

Propriedades mais utilizadas do JTextField/JPasswordField:

setText(String text):adiciona um texto no JTextField. setFont(Font font):permite alterar a fonte do JTextField. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setForeground(Color fg):define a cor da fonte. setBackground(Color bg):define a cor do fundo do JTextField. setEditable(boolean b):se o parâmetro for "true", o usuário pode alterar o texto do JTextField. Se for "false" o usuário não pode alterar o texto. setEnabled(boolean enabled):se o parâmetro for "false" o componente fica hachurado, ou seja, fica bloqueado para o usuário copiar um texto ou digitar. Se for "true" fica desbloqueado. setFocusable(boolean focusable):seta o foco para o JTextField. Para que o foco seja setado o parâmetro deve ser true. selectionColor(Color color):define a cor que o JTextField ficará ao selecionar seu texto. O padrão da cor de seleção é azul. selectedTextColor(Color color):define a cor que o texto do JTextField ficará ao ser selecionado. O padrão da cor do texto selecionado é branco. JTextField

JFormattedTextField: O JFormattedTextField é um campo bem semelhante ao JTextField, possuindo as mesmas propriedades e algumas a mais. Ele é utilizado quando o JTextField necessita de algum tipo de formatação, como a “Data”.

Além das propriedades mais utilizadas do JTextField, existe uma propriedade bastante utilizada pelo JFormattedTextField:

setFormatterFactory(AbstractFormatterFacotory tf):define a “máscara de formatação” utilizada pelo componente. O tipo de formatação é passado como parâmetro. Existem alguns tipos predefinidos e podem ser utilizados através da classe DefaultFormatterFactory que deve ser instanciada no parâmetro. Por sua vez, ao instanciar a classe DefaultFormatterFactory deve ser instanciada a classe correspondente ao tipo da formatação, as mais utilizadas são: NumberFormatter (formatação para números), DateFormatter (formatação para datas), MaskFormatter (pode ser passado uma máscara de formatação a sua escolha). JFormattedTextField

JTextArea O JTextArea é um componente utilizado para a entrada/saída de textos ou frases maiores. Ele permite que seja adicionada mais de uma linha.

Propriedades mais utilizadas do JTextArea:

setText(String string):coloca a String passada no parâmetro no JTextArea. Caso já exista um texto, remove-o e adiciona a nova String. append(String str):adiciona a String passada no parâmetro na área de texto. Mantém o texto existente, quebra a linha e então adiciona a nova String. setFont(Font font):permite alterar a fonte do JTextArea. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setForeground(Color fg):define a cor da fonte. setBackground(Color bg):define a cor do fundo da área de texto. setEditable(boolean b):se o parâmetro for "true", o usuário pode alterar o texto da área. Se for "false" o usuário não pode alterar o texto. JTextArea

JList A JList é uma lista utilizada normalmente para representar as saídas de um problema ou para listar informações. A JList trabalha com índices, cada linha representa um único índice.

Propriedades mais utilizadas da JList:

setModel(ListModel list):esse método permite adicionar/atualizar os dados na lista. Normalmente o ListModel passado no parâmetro é definido por um método que retorna a classe ListModel. Para adicionar elementos em um ListModel é utilizado o método .addElement(). Cada vez que é adicionado um elemento na JList é “quebrada” uma linha. setFont(Font font):permite alterar a fonte da JList. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setForeground(Color fg):define a cor da fonte. setBackground(Color bg):define a cor do fundo da lista. JList

JComboBox O JComboBox é utilizado como seletor de dados, onde são configurados determinados campos pelo programador e o usuário pode escolher um deles. Um exemplo prático seria um campo para escolher o estado, onde o usuário só poderia escolher um dos estados definidos. A caixão de seleção também trabalha com índices.

Propriedades mais utilizadas do JComboBox:

addItem(Object anObject):utilizado para adicionar um item/campo no JComboBox. O objeto passado no parâmetro normalmente é uma String. setSelectedIndex(int anIndex):define qual o item do JComboBox começa selecionado. setFont(Font font):permite alterar a fonte. A fonte é representada pela classe Font, onde é definido o nome, estilo e tamanho da fonte. JComboBoxJComboBox

JSpinner O JSpinner, semelhante ao JComboBox é utilizado para que o usuário possa selecionar uma informação dentre as pré definidas. O que muda, é que esse componente possui setas para cima e para baixo permitindo a visualização de seu conteúdo.

Propriedades mais importantes do JSpinner:

setModel(SpinnerModel model):adiciona um ou vários elementos no JSpinner. Existem três tipos de SpinnerModel: SpinnerDateModel (adiciona data no JSpinner), SpinnerListModel (adiciona uma lista de Strings), SpinnerNumberModel (adiciona uma lista de inteiros). A classe correspondente ao SpinnerModel deve ser instanciada no parâmetro. setFont(Font font):permite alterar a fonte do JSpinner. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setEnabled(Boolean enabled):quando o parâmetro é “true” o usuário pode escolher o item do JSpinner clicando na seta para cima ou para baixo, quando é “false” o campo fica bloqueado. JSpinner

JButton O JButton é o componente correspondente ao botão. É utilizado para que seja efetuada alguma tarefa ou função ao ser clicado.

Propriedades mais importantes do JButton:

setText(String string):define o texto do botão. setFont(Font font):permite alterar a fonte do JButton. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setBackground(Color bg):define a cor do fundo do botão. setForeground(Color fg):define a cor da fonte do botão. setEnabled(Boolean enabled):quando o parâmetro é “true” permite-se que o usuário clique no botão, quando é “false” o botão fica bloqueado. setIcon(Icon defaultIcon):seta um ícone para o botão. O ícone pode ser representado pela classe ImageIcon e deve ser passado o caminho da imagem de onde está o ícone. JButton

JRadioButton e JCheckBox O JRadioButton é um componente utilizado para que o usuário possa selecionar alguma informação definida pelo programador. Normalmente é utilizado em conjunto com outros JRadioButtons, para que o usuário tenha várias opção de seleção. Esse componente, geralmente é utilizado em casos onde o usuário deve selecionar apenas uma das opções disponíveis. O JCheckBox é semelhante ao JRadioButton, porém é utilizado quando o usuário pode, ou não, selecionar várias das opções disponíveis.

Propriedades mais importantes do JRadioButton/JCheckBox:

setText(String string):define o texto do JRadioButton/JCheckBox. setFont(Font font):permite alterar a fonte do componente. A fonte é representada pela classe Font, onde é definido o tamanho, estilo e nome da fonte. setForeground(Color fg):define a cor da fonte do botão de seleção. setHorizontalTextPosition(int alignment):define a posição do texto do componente. O alinhamento pode ser indicado pelas constantes: RIGHT/TRAILING (direita), LEFT/ LEADING (esquerda), CENTER (no centro). setSelected(Boolean b):se o parâmetro for “true” o botão de seleção fica selecionado, se for “false” fica deselecionado. JRadioButtonJCheckBox

ButtonGroup O ButtonGroup é um componente invisível para a tela. Ele normalmente é utilizado para gerenciar os grupos de JRadioButtons. Para que dois botões de seleção trabalhem em conjunto, ou seja, para que o usuário só possa selecionar um dos botões é necessário adicioná-lo ao ButtonGroup.

O grupo de botões tem apenas uma propriedade mais utilizada:

add(AbstractButton b):adiciona um botão, normalmente um JRadioButton, no grupo de botões. JSeparator O JSeparator é um componente visual utilizado apenas para separar outros componentes, deixando a tela mais organizada. Normalmente é utilizado em menus.

Propriedades mais importantes do JSeparator:

setBorder(Border border):define a borda do separador. A borda é representada pela classe BorderFactory e a partir dessa classe deve ser utilizado uns dos métodos de criação da borda, alguns deles são: createBevelBorder, createEmptyBorder, createLineBorder. setForeground(Color fg):define a cor da linha do separador. setBackground(Color bg):define a cor de fundo do separador. setSize(Dimension d):define o tamanho do separador, representado pela classe Dimension. Nessa classe é passada a largura e altura do componente. JSeparator

Esses são os componentes mais importantes da parte de controle. Algumas das propriedades foram citadas em um componente e não foram citadas no outro, mas isso não significa que o componente não possui tais propriedades, apenas não é muito usado.

Existem outras propriedades que podem ser utilizadas para todos os componentes:

setNextFocusableComponent(Component c):seta o próximo componente que receberá o foco. setToolTipText(String tip):ao deixar o mouse parado sobre o componente, aparecerá um quadro (normalmente amarelo) com o texto passado no parâmetro. É muito importante saber que alguns dos componentes apresentados nesse artigo, como o JTextArea, necessitam ser adicionados em um JScrollPane (componente apresentado na parte 1 do artigo) para que possuam as barras de rolagem.
