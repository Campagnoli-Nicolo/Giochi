using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Aereo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_esci_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btn_inserisci_Click(object sender, EventArgs e)
        {
            if(txt_nome.Text == "" || txt_nome.Text.Length >= 10)
            {
                MessageBox.Show("Non hai inserito un nome o il nome da te inserito e' troppo grande", "attenzione", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txt_nome.Text = "";
            }
            else
            {
                common.NomeGiocatore = txt_nome.Text;
                Aereo form = new Aereo();
                form.ShowDialog();
                
            }
        }
    }
}
