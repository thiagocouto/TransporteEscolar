import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';
import { Passageiro } from '../pages/passageiro/passageiro';
import { PassageiroInsert } from '../pages/passageiro-insert/passageiro-insert';
import { Viagem } from '../pages/viagem/viagem';

import { RestapiService } from '../providers/restapi-service';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { AgmCoreModule } from 'angular2-google-maps/core';
import { HttpModule } from '@angular/http';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    Passageiro,
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
    PassageiroInsert,
    Viagem
  ],
  providers: [
    StatusBar,
    SplashScreen,
    RestapiService,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
