import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';
import { Passageiro } from '../pages/passageiro/passageiro';
import { PassageiroChange } from '../pages/passageiro-change/passageiro-change';
import { PassageiroDetail } from '../pages/passageiro-detail/passageiro-detail';
import { PassageiroInsert } from '../pages/passageiro-insert/passageiro-insert';
import { Viagem } from '../pages/viagem/viagem';

import { PassageiroDetailsComponent } from '../components/passageiro-details.component';
import { PassageiroFormDadosPessoaisComponent } from '../components/passageiro-formDadosPessoais.component';
import { PassageiroFormEnderecoComponent } from '../components/passageiro-formEndereco.component';
import { PassageiroFormHorarioComponent } from '../components/passageiro-formHorario.component';
import { PassageiroFormTurnoComponent } from '../components/passageiro-formTurno.component';

import { RestapiService } from '../providers/restapi-service';
import { RestapiServiceHorario } from '../providers/restapi-serviceHorario';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { AgmCoreModule } from 'angular2-google-maps/core';
import { HttpModule } from '@angular/http';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    Passageiro,
    PassageiroChange,
    PassageiroDetail,
    PassageiroDetailsComponent,
    PassageiroFormDadosPessoaisComponent,
    PassageiroFormEnderecoComponent,
    PassageiroFormHorarioComponent,
    PassageiroFormTurnoComponent,
    PassageiroInsert,
    ListPage,
    Viagem
  ],
  imports: [
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyCbsO8OiXdTP6Jt1jWMgCCkigSiWSw3-Is'
    }),
    BrowserModule,
    HttpModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ListPage,
    Passageiro,
    PassageiroChange,
    PassageiroDetail,
    PassageiroInsert,
    Viagem
  ],
  providers: [
    StatusBar,
    SplashScreen,
    RestapiService,
    RestapiServiceHorario,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
