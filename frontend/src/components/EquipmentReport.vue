<template>
    <div>
        <Number
            label="EquipReportid"
            v-model="value.equipReportid"
            :editMode="editMode"
        />
        <String
            label="Title"
            v-model="value.title"
            :editMode="editMode"
        />
        <String
            label="MaintenanceCost"
            v-model="value.maintenanceCost"
            :editMode="editMode"
        />
        <String
            label="ReportContents"
            v-model="value.reportContents"
            :editMode="editMode"
        />
        <Number
            label="EquipmentId"
            v-model="value.equipmentId"
            :editMode="editMode"
        />
        <String
            label="State"
            v-model="value.state"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'EquipmentReport',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "equipmentReports",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
