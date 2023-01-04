using System;
using System.Drawing;
using System.Windows.Forms;

public class Homepage : Form{
    private Button _button1 = new Button();
    private Button _button2 = new Button();
    TextBox _Heading = new TextBox();
    private void Button1(object sender, System.EventArgs e){
        ControlPaint.DrawButton(
            System.Drawing.Graphics.FromHwnd(_button1.Handle), 0, 0,
            _button1.Width, _button1.Height,
            ButtonState.Flat);
    }

    private void Button2(object sender, System.EventArgs e){
        ControlPaint.DrawButton(
            System.Drawing.Graphics.FromHwnd(_button2.Handle), 20, 20,
            _button2.Width, _button2.Height,
            ButtonState.Flat);
    }

    public Homepage(){
        _button1.Location = new Point(20, 20);
        _button2.Location = new Point(370, 20);
        this._Heading.Text = "abc";
        this.Click += Button1;
        this.Click += Button2;
        this.Controls.Add(_button1);
        this.Controls.Add(_button2);
        this.Controls.Add(_Heading);
    }
    public void FormLayout(){
        this.Name = "Homepage";
        this.Text = "BirdBirdNet - Login Page";
        this.Size = new System.Drawing.Size(500, 500);
        this.StartPosition = FormStartPosition.CenterScreen;
    }
}
