using System;
using System.Drawing;
using System.Windows.Forms;

namespace Aereo
{
    public partial class Aereo : Form
    {
        bool up, down, left, right;

        public Aereo()
        {
            InitializeComponent();
            lbl_nome.Text = "ciao:  " + common.NomeGiocatore;
            gbx_direzione.Enabled = false;
            gbx_velocita.Enabled = false;
            pcb_image.Image = Properties.Resources.planeUp;

        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {

        }

        private void btn_esci_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void timer_Tick(object sender, EventArgs e)
        {
            int totale = tbr_velo.Value;

            if(cbx_bonus.Checked)
            {
                totale += 5;
                lbl_speed.Text = "Velocita: " + totale;
            }
            else
            {
                lbl_speed.Text = "Velocita: " + totale;
            }

            if(up)
            {
                pcb_image.Top -= totale;
            }
            if(down)
            {
                pcb_image.Top += totale;
            }
            if (right)
            {
                pcb_image.Left += totale;
            }
            if (left)
            {
                pcb_image.Left -= totale;
            }
            if(pcb_image.Top < 160)
            {
                pcb_image.Top = 625;
            }
            if (pcb_image.Top > 625)
            {
                pcb_image.Top = 160;
            }
            if (pcb_image.Left < 0)
            {
                pcb_image.Left = 799;
            }
            if (pcb_image.Left > 799)
            {
                pcb_image.Left = 0;
            }
        }

        private void btn_start_stop_Click(object sender, EventArgs e)
        {
            if(btn_start_stop.Text == "Start")
            {
                btn_start_stop.Text = "Stop";
                gbx_direzione.Enabled = true;
                gbx_velocita.Enabled = true;
            }
            else if(btn_start_stop.Text == "Stop")
            {
                gbx_velocita.Enabled = false;
                gbx_direzione.Enabled = false;
                lbl_speed.Text = "Velocita: 0 ";
                tbr_velo.Value = 0;
            }
           
        }

        private void btn_reset_Click(object sender, EventArgs e)
        {
            tbr_velo.Value = 0;
            cbx_bonus.Checked = false;
            lbl_speed.Text = "Velocita: 0 ";
            gbx_direzione.Enabled = true;
            gbx_velocita.Enabled = true;
            pcb_image.Image = Properties.Resources.planeUp;
            pcb_image.Location = new Point(356,262);
        }

        private void btn_dx_Click(object sender, EventArgs e)
        {
            pcb_image.Image = Properties.Resources.planeRight;

            up = false;
            down = false;
            left = false;
            right = true;
          

        }

        private void btn_giu_Click(object sender, EventArgs e)
        {
            pcb_image.Image = Properties.Resources.planeDown;
             up = false;
            down = true;
            left = false;
            right = false;
        }

        private void btn_sx_Click(object sender, EventArgs e)
        {
            pcb_image.Image = Properties.Resources.planeLeft;
            up = false;
            down = false;
            left = true;
            right = false;
        }

        private void btn_su_Click(object sender, EventArgs e)
        {
            pcb_image.Image = Properties.Resources.planeUp;
            up = true;
            down = false;
            left = false;
            right = false;
        }
    }
}
