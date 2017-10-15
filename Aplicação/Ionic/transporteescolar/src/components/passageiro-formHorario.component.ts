import { Component, Input } from "@angular/core";

import { RestapiServiceHorario } from '../providers/restapi-serviceHorario';

@Component({
    selector: 'component-passageiro-formHorario',
    templateUrl: 'passageiro-formHorario.component.html',
})

export class PassageiroFormHorarioComponent {

    _horariosSegundaIda: any;
    _horariosTercaIda: any;
    _horariosQuartaIda: any;
    _horariosQuintaIda: any;
    _horariosSextaIda: any;

    _horariosSegundaVolta: any;
    _horariosTercaVolta: any;
    _horariosQuartaVolta: any;
    _horariosQuintaVolta: any;
    _horariosSextaVolta: any;

    _passageiro: any;

    constructor(public restapiServiceHorario: RestapiServiceHorario) {
        this.getHorariosSegundaIda();
        this.getHorariosTercaIda();
        this.getHorariosQuartaIda();
        this.getHorariosQuintaIda();
        this.getHorariosSextaIda();
        this.getHorariosSegundaVolta();
        this.getHorariosTercaVolta();
        this.getHorariosQuartaVolta();
        this.getHorariosQuintaVolta();
        this.getHorariosSextaVolta();
    }

    @Input()
    set passageiro(passageiro) {
        this._passageiro = passageiro;
    }

    get passageiro() {
        return this._passageiro;
    }

    getHorariosSegundaIda() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEGUNDA', 'IDA')
            .then(data => {
                this._horariosSegundaIda = data;
                console.log("resposta: " + this._horariosSegundaIda);
            });
    }

    getHorariosTercaIda() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('TERCA', 'IDA')
            .then(data => {
                this._horariosTercaIda = data;
            });
    }

    getHorariosQuartaIda() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUARTA', 'IDA')
            .then(data => {
                this._horariosQuartaIda = data;
            });
    }

    getHorariosQuintaIda() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUINTA', 'IDA')
            .then(data => {
                this._horariosQuintaIda = data;
            });
    }

    getHorariosSextaIda() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEXTA', 'IDA')
            .then(data => {
                this._horariosSextaIda = data;
            });
    }

    getHorariosSegundaVolta() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEGUNDA', 'VOLTA')
            .then(data => {
                this._horariosSegundaVolta = data;
            });
    }

    getHorariosTercaVolta() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('TERCA', 'VOLTA')
            .then(data => {
                this._horariosTercaVolta = data;
            });
    }

    getHorariosQuartaVolta() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUARTA', 'VOLTA')
            .then(data => {
                this._horariosQuartaVolta = data;
            });
    }

    getHorariosQuintaVolta() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('QUINTA', 'VOLTA')
            .then(data => {
                this._horariosQuintaVolta = data;
            });
    }

    getHorariosSextaVolta() {
        this.restapiServiceHorario.getHorariosDiaSemanaTipoHorario('SEXTA', 'VOLTA')
            .then(data => {
                this._horariosSextaVolta = data;
            });
    }
}