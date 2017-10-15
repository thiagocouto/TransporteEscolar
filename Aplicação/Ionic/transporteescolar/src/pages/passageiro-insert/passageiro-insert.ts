import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

import { RestapiService } from '../../providers/restapi-service';

/**
 * Generated class for the PassageiroInsert page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-passageiro-insert',
  templateUrl: 'passageiro-insert.html',
})
export class PassageiroInsert {

  passageiro = {agenda: {horarios: [
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     },
                                     {diaSemana: '',
                                      hora: '',
                                      tipoHorario: '',
                                      turno: ''
                                     }
                                   ]
                        },
                email: '',
                endereco: {bairro: '',
                           complemento: '',
                           localizacao : {latitude: '',
                                          longitude: ''
                                         },
                           logradouro: '',
                           numero: ''
                          },
                nome: '',
                telefone: '',
                turno: ''
               };

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams, 
    public restapiService: RestapiService) {
  }
  
  ionViewDidLoad() {
    console.log('ionViewDidLoad PassageiroInsert');
  }

  insertPassageiro(){
    this.restapiService.savePassageiro(this.passageiro).then((result) => {
      console.log(result);
    }, (err) => {
      console.log(err);
    });
  }

}
