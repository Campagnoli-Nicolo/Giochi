namespace Aereo
{
    partial class Aereo
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.gbx_direzione = new System.Windows.Forms.GroupBox();
            this.btn_sx = new System.Windows.Forms.Button();
            this.btn_giu = new System.Windows.Forms.Button();
            this.btn_dx = new System.Windows.Forms.Button();
            this.btn_su = new System.Windows.Forms.Button();
            this.gbx_velocita = new System.Windows.Forms.GroupBox();
            this.lbl_speed = new System.Windows.Forms.Label();
            this.cbx_bonus = new System.Windows.Forms.CheckBox();
            this.tbr_velo = new System.Windows.Forms.TrackBar();
            this.gbx_comandi = new System.Windows.Forms.GroupBox();
            this.lbl_nome = new System.Windows.Forms.Label();
            this.btn_start_stop = new System.Windows.Forms.Button();
            this.btn_reset = new System.Windows.Forms.Button();
            this.btn_esci = new System.Windows.Forms.Button();
            this.timer = new System.Windows.Forms.Timer(this.components);
            this.pcb_image = new System.Windows.Forms.PictureBox();
            this.gbx_direzione.SuspendLayout();
            this.gbx_velocita.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.tbr_velo)).BeginInit();
            this.gbx_comandi.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pcb_image)).BeginInit();
            this.SuspendLayout();
            // 
            // gbx_direzione
            // 
            this.gbx_direzione.Controls.Add(this.btn_sx);
            this.gbx_direzione.Controls.Add(this.btn_giu);
            this.gbx_direzione.Controls.Add(this.btn_dx);
            this.gbx_direzione.Controls.Add(this.btn_su);
            this.gbx_direzione.Location = new System.Drawing.Point(12, 12);
            this.gbx_direzione.Name = "gbx_direzione";
            this.gbx_direzione.Size = new System.Drawing.Size(170, 158);
            this.gbx_direzione.TabIndex = 0;
            this.gbx_direzione.TabStop = false;
            this.gbx_direzione.Text = "Direzione";
            // 
            // btn_sx
            // 
            this.btn_sx.Font = new System.Drawing.Font("Wingdings", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.btn_sx.Location = new System.Drawing.Point(6, 57);
            this.btn_sx.Name = "btn_sx";
            this.btn_sx.Size = new System.Drawing.Size(49, 45);
            this.btn_sx.TabIndex = 2;
            this.btn_sx.Text = "ç";
            this.btn_sx.UseVisualStyleBackColor = true;
            this.btn_sx.Click += new System.EventHandler(this.btn_sx_Click);
            // 
            // btn_giu
            // 
            this.btn_giu.Font = new System.Drawing.Font("Wingdings", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.btn_giu.Location = new System.Drawing.Point(60, 103);
            this.btn_giu.Name = "btn_giu";
            this.btn_giu.Size = new System.Drawing.Size(49, 45);
            this.btn_giu.TabIndex = 3;
            this.btn_giu.Text = "ê";
            this.btn_giu.UseVisualStyleBackColor = true;
            this.btn_giu.Click += new System.EventHandler(this.btn_giu_Click);
            // 
            // btn_dx
            // 
            this.btn_dx.Font = new System.Drawing.Font("Wingdings", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.btn_dx.Location = new System.Drawing.Point(115, 57);
            this.btn_dx.Name = "btn_dx";
            this.btn_dx.Size = new System.Drawing.Size(49, 45);
            this.btn_dx.TabIndex = 4;
            this.btn_dx.Text = "è";
            this.btn_dx.UseVisualStyleBackColor = true;
            this.btn_dx.Click += new System.EventHandler(this.btn_dx_Click);
            // 
            // btn_su
            // 
            this.btn_su.Font = new System.Drawing.Font("Wingdings", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(2)));
            this.btn_su.Location = new System.Drawing.Point(60, 16);
            this.btn_su.Name = "btn_su";
            this.btn_su.Size = new System.Drawing.Size(49, 45);
            this.btn_su.TabIndex = 0;
            this.btn_su.Text = "é";
            this.btn_su.UseVisualStyleBackColor = true;
            this.btn_su.Click += new System.EventHandler(this.btn_su_Click);
            // 
            // gbx_velocita
            // 
            this.gbx_velocita.Controls.Add(this.lbl_speed);
            this.gbx_velocita.Controls.Add(this.cbx_bonus);
            this.gbx_velocita.Controls.Add(this.tbr_velo);
            this.gbx_velocita.Location = new System.Drawing.Point(188, 12);
            this.gbx_velocita.Name = "gbx_velocita";
            this.gbx_velocita.Size = new System.Drawing.Size(357, 158);
            this.gbx_velocita.TabIndex = 2;
            this.gbx_velocita.TabStop = false;
            this.gbx_velocita.Text = "Velocità";
            // 
            // lbl_speed
            // 
            this.lbl_speed.AutoSize = true;
            this.lbl_speed.Location = new System.Drawing.Point(165, 103);
            this.lbl_speed.Name = "lbl_speed";
            this.lbl_speed.Size = new System.Drawing.Size(35, 13);
            this.lbl_speed.TabIndex = 2;
            this.lbl_speed.Text = "label1";
            // 
            // cbx_bonus
            // 
            this.cbx_bonus.AutoSize = true;
            this.cbx_bonus.Location = new System.Drawing.Point(6, 103);
            this.cbx_bonus.Name = "cbx_bonus";
            this.cbx_bonus.Size = new System.Drawing.Size(74, 17);
            this.cbx_bonus.TabIndex = 1;
            this.cbx_bonus.Text = "Bonus(+5)";
            this.cbx_bonus.UseVisualStyleBackColor = true;
            // 
            // tbr_velo
            // 
            this.tbr_velo.Location = new System.Drawing.Point(6, 19);
            this.tbr_velo.Name = "tbr_velo";
            this.tbr_velo.Size = new System.Drawing.Size(345, 45);
            this.tbr_velo.TabIndex = 0;
            // 
            // gbx_comandi
            // 
            this.gbx_comandi.Controls.Add(this.lbl_nome);
            this.gbx_comandi.Controls.Add(this.btn_start_stop);
            this.gbx_comandi.Controls.Add(this.btn_reset);
            this.gbx_comandi.Controls.Add(this.btn_esci);
            this.gbx_comandi.Location = new System.Drawing.Point(551, 12);
            this.gbx_comandi.Name = "gbx_comandi";
            this.gbx_comandi.Size = new System.Drawing.Size(220, 158);
            this.gbx_comandi.TabIndex = 3;
            this.gbx_comandi.TabStop = false;
            this.gbx_comandi.Text = "Comandi";
            // 
            // lbl_nome
            // 
            this.lbl_nome.AutoSize = true;
            this.lbl_nome.Location = new System.Drawing.Point(52, 34);
            this.lbl_nome.Name = "lbl_nome";
            this.lbl_nome.Size = new System.Drawing.Size(33, 13);
            this.lbl_nome.TabIndex = 6;
            this.lbl_nome.Text = "nome";
            // 
            // btn_start_stop
            // 
            this.btn_start_stop.Location = new System.Drawing.Point(55, 50);
            this.btn_start_stop.Name = "btn_start_stop";
            this.btn_start_stop.Size = new System.Drawing.Size(118, 30);
            this.btn_start_stop.TabIndex = 4;
            this.btn_start_stop.Text = "Start";
            this.btn_start_stop.UseVisualStyleBackColor = true;
            this.btn_start_stop.Click += new System.EventHandler(this.btn_start_stop_Click);
            // 
            // btn_reset
            // 
            this.btn_reset.Location = new System.Drawing.Point(55, 86);
            this.btn_reset.Name = "btn_reset";
            this.btn_reset.Size = new System.Drawing.Size(118, 30);
            this.btn_reset.TabIndex = 3;
            this.btn_reset.Text = "Reset";
            this.btn_reset.UseVisualStyleBackColor = true;
            this.btn_reset.Click += new System.EventHandler(this.btn_reset_Click);
            // 
            // btn_esci
            // 
            this.btn_esci.Location = new System.Drawing.Point(55, 122);
            this.btn_esci.Name = "btn_esci";
            this.btn_esci.Size = new System.Drawing.Size(118, 30);
            this.btn_esci.TabIndex = 2;
            this.btn_esci.Text = "Esci";
            this.btn_esci.UseVisualStyleBackColor = true;
            this.btn_esci.Click += new System.EventHandler(this.btn_esci_Click);
            // 
            // timer
            // 
            this.timer.Enabled = true;
            this.timer.Tick += new System.EventHandler(this.timer_Tick);
            // 
            // pcb_image
            // 
            this.pcb_image.Location = new System.Drawing.Point(356, 262);
            this.pcb_image.Name = "pcb_image";
            this.pcb_image.Size = new System.Drawing.Size(126, 127);
            this.pcb_image.TabIndex = 4;
            this.pcb_image.TabStop = false;
            // 
            // Aereo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(783, 586);
            this.Controls.Add(this.pcb_image);
            this.Controls.Add(this.gbx_comandi);
            this.Controls.Add(this.gbx_velocita);
            this.Controls.Add(this.gbx_direzione);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "Aereo";
            this.Text = "Aereo";
            this.gbx_direzione.ResumeLayout(false);
            this.gbx_velocita.ResumeLayout(false);
            this.gbx_velocita.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.tbr_velo)).EndInit();
            this.gbx_comandi.ResumeLayout(false);
            this.gbx_comandi.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pcb_image)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gbx_direzione;
        private System.Windows.Forms.Button btn_sx;
        private System.Windows.Forms.Button btn_giu;
        private System.Windows.Forms.Button btn_dx;
        private System.Windows.Forms.Button btn_su;
        private System.Windows.Forms.GroupBox gbx_velocita;
        private System.Windows.Forms.CheckBox cbx_bonus;
        private System.Windows.Forms.TrackBar tbr_velo;
        private System.Windows.Forms.GroupBox gbx_comandi;
        private System.Windows.Forms.Button btn_start_stop;
        private System.Windows.Forms.Button btn_reset;
        private System.Windows.Forms.Button btn_esci;
        private System.Windows.Forms.Label lbl_nome;
        private System.Windows.Forms.Timer timer;
        private System.Windows.Forms.Label lbl_speed;
        private System.Windows.Forms.PictureBox pcb_image;
    }
}