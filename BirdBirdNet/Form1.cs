using System;
using System.Drawing;
using System.Windows.Forms;

public class Homepage : Form{
    private Button _button1 = new Button();
    private Button _button2 = new Button();
    private TextBox _Heading1 = new TextBox();
    private TextBox _Heading2 = new TextBox();
    private Label _title = new Label();
    private void Button1(object sender, System.EventArgs e){
        ControlPaint.DrawButton(
            System.Drawing.Graphics.FromHwnd(_button1.Handle), 200, 200,
            _button1.Width, _button1.Height,
            ButtonState.Flat);
    }

    private void Button2(object sender, System.EventArgs e){
        ControlPaint.DrawButton(
            System.Drawing.Graphics.FromHwnd(_button2.Handle), 200, 200,
            _button2.Width, _button2.Height,
            ButtonState.Flat);
    }
    public Homepage(){
        _button1.Location = new Point(20, 120);
        _button2.Location = new Point(370, 120);
        _Heading1.Location = new Point(100, 100);
        _Heading2.Location = new Point(0, 0);

        _title.Location = new Point(45, 30);
        _title.Text = "BirdBirdNet - Login Page";
        _title.AutoSize = true;
        _title.Font = new Font("Calibri", 27, FontStyle.Bold);
        _title.ForeColor = Color.Green;
        _title.Padding = new Padding(6);

        this._Heading1.Text = "abc";
        this._Heading2.Text = "bcd";
        this.Click += Button1;
        this.Click += Button2;

        this.Controls.Add(_button1);
        this.Controls.Add(_button2);
        this.Controls.Add(_Heading1);
        this.Controls.Add(_Heading2);
        this.Controls.Add(_title);
    }
    public void FormLayout(){
        this.Name = "Homepage";
        this.Text = "BirdBirdNet - Login Page";
        this.Size = new System.Drawing.Size(500, 500);
        this.MinimizeBox = true;
        this.MaximizeBox = false;
        this.StartPosition = FormStartPosition.CenterScreen;
    }
}
